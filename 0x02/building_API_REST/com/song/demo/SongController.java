package com.song.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * SongController
 *
 * REST controller for song API.
 */
@RestController
public class SongController
{
    @Autowired
    private SongRepository songRepository;

    /**
     * welcomeMessage - returns welcome message
     *
     * Return: welcome string
     */
    @GetMapping("/welcome")
    public String welcomeMessage()
    {
        return "WELCOME TO SONG API";
    }

    /**
     * getAllSongs - lists all songs
     *
     * Return: list of songs
     */
    @GetMapping("/allSongs")
    public List<Song> getAllSongs()
    {
        return songRepository.getAllSongs();
    }

    /**
     * findSongById - finds song by id
     *
     * @param id song id
     *
     * Return: song
     */
    @GetMapping("/findSong/{id}")
    public Song findSongById(@PathVariable Integer id)
    {
        return songRepository.getSongById(id);
    }

    /**
     * addSong - adds a new song
     *
     * @param song song object
     *
     * Return: added song
     */
    @PostMapping(path = "/addSong", consumes = "application/json", produces = "application/json")
    public Song addSong(@RequestBody Song song)
    {
        songRepository.addSong(song);
        return song;
    }

    /**
     * updateSong - updates a song
     *
     * @param song song object
     *
     * Return: updated song
     */
    @PutMapping(path = "/updateSong", consumes = "application/json", produces = "application/json")
    public Song updateSong(@RequestBody Song song)
    {
        songRepository.updateSong(song);
        return song;
    }

    /**
     * deleteSongById - removes a song
     *
     * @param song song object
     */
    @DeleteMapping(path = "/removeSong", consumes = "application/json", produces = "application/json")
    public void deleteSongById(@RequestBody Song song)
    {
        songRepository.removeSong(song);
    }
}
