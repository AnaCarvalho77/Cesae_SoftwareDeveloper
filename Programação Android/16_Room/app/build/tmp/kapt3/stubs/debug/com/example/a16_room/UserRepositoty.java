package com.example.a16_room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/a16_room/UserRepositoty;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "userDatabase", "Lcom/example/a16_room/UserDAO;", "delete", "", "user", "Lcom/example/a16_room/UserModel;", "get", "id", "getAll", "", "insert", "", "update", "app_debug"})
public final class UserRepositoty {
    @org.jetbrains.annotations.NotNull()
    private final com.example.a16_room.UserDAO userDatabase = null;
    
    public UserRepositoty(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final long insert(@org.jetbrains.annotations.NotNull()
    com.example.a16_room.UserModel user) {
        return 0L;
    }
    
    public final int update(@org.jetbrains.annotations.NotNull()
    com.example.a16_room.UserModel user) {
        return 0;
    }
    
    public final int delete(@org.jetbrains.annotations.NotNull()
    com.example.a16_room.UserModel user) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.a16_room.UserModel get(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.a16_room.UserModel> getAll() {
        return null;
    }
}