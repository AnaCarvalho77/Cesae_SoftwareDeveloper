package com.example.a16_room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/a16_room/UserDatabase;", "Landroidx/room/RoomDatabase;", "()V", "userDAO", "Lcom/example/a16_room/UserDAO;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.example.a16_room.UserModel.class}, version = 1)
public abstract class UserDatabase extends androidx.room.RoomDatabase {
    public static com.example.a16_room.UserDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.a16_room.UserDatabase.Companion Companion = null;
    
    public UserDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.a16_room.UserDAO userDAO();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/example/a16_room/UserDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/a16_room/UserDatabase;", "getINSTANCE", "()Lcom/example/a16_room/UserDatabase;", "setINSTANCE", "(Lcom/example/a16_room/UserDatabase;)V", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.a16_room.UserDatabase getINSTANCE() {
            return null;
        }
        
        public final void setINSTANCE(@org.jetbrains.annotations.NotNull()
        com.example.a16_room.UserDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.a16_room.UserDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}