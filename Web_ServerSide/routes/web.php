<?php

use App\Http\Controllers\IndexController;
use App\Http\Controllers\UsersController;
use App\Http\Controllers\TasksController;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/', function () {
    return view('welcome');
})->name('bemvindos');

Route::get('/home', [IndexController::class,'index'])->
name('home.index');

Route::get('/ola', function () {
    return '<h1> Hello turma de Software </h1>';
})->name('home.hello');

Route::get('/hello/{nome}', function ($nome) {
    return '<h1> Hello turma de Software </h1>'.$nome;
});

//Rotas users
Route::get('/users/add', [UsersController::class,'addUsers'])-> name('users.add');
Route::post('/users/create', [UsersController::class,'createUser'])->name('users.create');
Route::post('/users/update', [UsersController::class,'updateUser'])->name('users.update');

Route::get('/users/all', [UsersController::class,'allUsers'])-> name('users.all');
Route::get('/users/view/{id}', [UsersController::class,'viewUser'])->name('users.view');
Route::get('/users/delete/{id}', [UsersController::class,'deleteUser'])->name('users.delete');


//rotas tasks
Route::get('/tasks/all', [TasksController::class,'allTasks'])->name('tasks.all');
Route::get('/tasks/add', [TasksController::class,'addTasks'])-> name('tasks.add');
Route::get('/tasks/view/{id}', [TasksController::class,'viewTask'])->name('tasks.view');
Route::get('/tasks/delete/{id}', [TasksController::class,'deleteTask'])->name('tasks.delete');
Route::post('/tasks/create', [TasksController::class,'createTask'])->name('tasks.create');
Route::post('/tasks/update', [TasksController::class,'updateTask'])->name('tasks.update');


//rota para voltar atras quando pagina não encontrada
Route::fallback(function () {
    return view ('main.fallBack');
});
