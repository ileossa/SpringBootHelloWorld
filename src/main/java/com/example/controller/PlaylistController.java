package com.example.controller;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by swip on 08/03/2016.
 */
@RestController
@RequestMapping("/playlist")
public class PlaylistController {

    @RequestMapping(value = "/{idPlaylist : ^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$}", method = RequestMethod.GET)
    public int playlistList(
            @PathVariable("idPlaylist")int idPlaylist){

        return idPlaylist;
    }
}
