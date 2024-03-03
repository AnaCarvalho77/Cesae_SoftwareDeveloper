<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\IndexController;
use App\Http\Controllers\UsersController;
use App\Http\Controllers\AlbunsController;
use App\Http\Controllers\BandasController;
use App\Http\Controllers\DashboardController;

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
});

Route::get('/home', [IndexController::class,'index'])->
name('home.index');

//Rotas users
Route::get('/users/add', [UsersController::class,'addUsers'])-> name('users.add');
Route::post('/users/create', [UsersController::class,'createUser'])->name('users.create');
Route::post('/users/update', [UsersController::class,'updateUser'])->name('users.update');

Route::get('/users/all', [UsersController::class,'allUsers'])-> name('users.all');
Route::get('/users/view/{id}', [UsersController::class,'viewUser'])->name('users.view');
Route::get('/users/update{id}', [UsersController::class,'verUpdateUser'])->name('users.verUpdate');
Route::get('/users/delete/{id}', [UsersController::class,'deleteUser'])->name('users.delete');


//rotas bandas
Route::get('/bandas/all', [BandasController::class,'allBandas'])->name('bandas.all');
Route::get('/bandas/add', [BandasController::class,'addBandas'])-> name('bandas.add');
Route::get('/bandas/view/{id}', [BandasController::class,'viewBandas'])->name('bandas.view');
Route::get('/bandas/update{id}', [BandasController::class,'verUpdateBanda'])->name('bandas.verUpdate');
Route::get('/bandas/delete/{id}', [BandasController::class,'deleteBanda'])->name('bandas.delete');
Route::post('/bandas/create', [BandasController::class,'createBanda'])->name('bandas.create');
Route::post('/bandas/update', [BandasController::class,'updateBanda'])->name('bandas.update');


//rotas Albund
Route::get('/albuns/all', [AlbunsController::class,'allAlbuns'])->name('albuns.all');
Route::get('/albuns/add', [AlbunsController::class,'addAlbuns'])-> name('albuns.add');
Route::get('/albuns/view/{id}', [AlbunsController::class,'viewAlbuns'])->name('albuns.view');
Route::get('/albuns/update{id}', [AlbunsController::class,'verUpdateAlbum'])->name('albuns.verUpdate');
Route::get('/albuns/delete/{id}', [AlbunsController::class,'deleteAlbum'])->name('albuns.delete');
Route::post('/albuns/create', [AlbunsController::class,'createAlbum'])->name('albuns.create');
Route::post('/albuns/update', [AlbunsController::class,'updateAlbum'])->name('albuns.update');

//rotas backoffice
Route::get('dashboard/home', [DashboardController::class,'index'])->name('dashboard.home');



//rota para voltar atras quando pagina não encontrada
Route::fallback(function () {
    return view ('main.fallBack');
});
