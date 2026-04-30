package com.song.demo;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

/**
 * SongRepository
 *
 * In-memory repository for managing songs.
 */
@Repository
public class SongRepository
{
    private List<Song> list = new ArrayList<Song>();

    /**
     * getAllSongs - returns all songs
     *
     * Return: list of songs
     */
    public List<Song> getAllSongs()
    {
        return list;
    }

    /**
     * getSongById - finds song by id
     *
     * @param id song id
     *
     * Return: song or null
     */
    public Song getSongById(Integer id)
    {
        for (Song s : list)
        {
            if (s.getId().equals(id))
            {
                return s;
            }
        }
        return null;
    }

    /**
     * addSong - adds a song
     *
     * @param s song to add
     */
    public void addSong(Song s)
    {
        list.add(s);
    }

    /**
     * updateSong - updates existing song
     *
     * @param s song to update
     */
    public void updateSong(Song s)
    {
        for (Song song : list)
        {
            if (song.getId().equals(s.getId()))
            {
                song.setName(s.getName());
                song.setArtist(s.getArtist());
                song.setAlbum(s.getAlbum());
                song.setReleaseYear(s.getReleaseYear());
            }
        }
    }

    /**
     * removeSong - removes a song
     *
     * @param s song to remove
     */
    public void removeSong(Song s)
    {
        list.removeIf(song -> song.getId().equals(s.getId()));
    }
}
