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


Route::get('/users/add', [UsersController::class,'addUsers'])-> name('users.add');
Route::get('/users/all', [UsersController::class,'allUsers'])-> name('users.all');
Route::get('/users/view/{id}', [UsersController::class,'viewUser'])->name('users.view');


Route::get('/tasks/all', [TasksController::class,'allTasks'])->name('tasks.all');

Route::fallback(function () {
    return view ('main.fallBack');
});
