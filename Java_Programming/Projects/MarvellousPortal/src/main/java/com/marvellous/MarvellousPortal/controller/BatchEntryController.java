package com.marvellous.MarvellousPortal.controller;

import com.marvellous.MarvellousPortal.Entity.BatchEntry;
import com.marvellous.MarvellousPortal.service.BatchEntryService;
import jakarta.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/batches")
public class BatchEntryController
{
    @Autowired
    private BatchEntryService batchEntryService;

    @GetMapping
    public ResponseEntity<?> getAll()
    {
        List<BatchEntry> alldata = batchEntryService.getAll();
        if(alldata != null && !alldata.isEmpty())
        {
            return new ResponseEntity<>(alldata, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<BatchEntry> createEntry(@Valid @RequestBody BatchEntry myentry)
    {
        try
        {
            batchEntryService.saveEntry(myentry);
            return new ResponseEntity<>(myentry, HttpStatus.CREATED);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/id/{myid}")
    public ResponseEntity<BatchEntry> getBatchEntryById(@PathVariable ObjectId myid)
    {
        Optional<BatchEntry> batchEntry = batchEntryService.findById(myid);
        if(batchEntry.isPresent())
        {
            return new ResponseEntity<>(batchEntry.get(), HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/id/{myid}")
    public ResponseEntity<?> deleteEntryById(@PathVariable ObjectId myid)
    {
        batchEntryService.deleteById(myid);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/id/{myid}")
    public ResponseEntity<?> updateEntryById(@PathVariable ObjectId myid, @Valid @RequestBody BatchEntry myentry)
    {
        BatchEntry old = batchEntryService.findById(myid).orElse(null);
        if(old != null)
        {
            old.setName(myentry.getName());
            old.setFees(myentry.getFees());
            batchEntryService.saveEntry(old);
            return new ResponseEntity<>(old, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}