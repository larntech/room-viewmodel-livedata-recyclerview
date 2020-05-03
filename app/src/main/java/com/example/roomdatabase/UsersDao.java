package com.example.roomdatabase;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UsersDao {

    @Insert
    void insertUsers(Users users);

    @Query("SELECT * from users")
    LiveData<List<Users>>  getAllUsers();

}
