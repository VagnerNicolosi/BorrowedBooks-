package BorrowedBooks.api.controller;

import BorrowedBooks.api.owner.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/owner")
public class OwnerController {
    @Autowired
    private OwnerRepository repository;
    @PostMapping @Transactional
    public void register(@RequestBody @Valid OwnerData data){
        repository.save(new Owner(data));
    }
    @GetMapping
    public Page<OwnerList> listing(@PageableDefault (size = 10, sort = {"name"})Pageable pagination){
      return repository.findAllByActivieTrue(pagination).map(OwnerList::new);
    };
    @PutMapping @Transactional
    public void update(@RequestBody @Valid UpdateOwnerData data){
        var owner = repository.getReferenceById(data.idTbOwner());
        owner.UpdateOwnerData(data);
    }
    @DeleteMapping("/{idTbOwner}") @Transactional
    public ResponseEntity Delete(@PathVariable Long idTbOwner) {
        var owner = repository.getReferenceById(idTbOwner);
        owner.Delete();
        return ResponseEntity.noContent().build();
    }
}
