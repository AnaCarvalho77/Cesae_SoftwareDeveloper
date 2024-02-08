package com.example.a16_room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/example/a16_room/UserDAO;", "", "delete", "", "user", "Lcom/example/a16_room/UserModel;", "get", "id", "getAll", "", "insert", "", "update", "app_debug"})
@androidx.room.Dao()
public abstract interface UserDAO {
    
    @androidx.room.Insert()
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.example.a16_room.UserModel user);
    
    @androidx.room.Update()
    public abstract int update(@org.jetbrains.annotations.NotNull()
    com.example.a16_room.UserModel user);
    
    @androidx.room.Delete()
    public abstract int delete(@org.jetbrains.annotations.NotNull()
    com.example.a16_room.UserModel user);
    
    @androidx.room.Query(value = "SELECT * FROM User WHERE id = :id")
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.a16_room.UserModel get(int id);
    
    @androidx.room.Query(value = "SELECT * FROM User")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.a16_room.UserModel> getAll();
}