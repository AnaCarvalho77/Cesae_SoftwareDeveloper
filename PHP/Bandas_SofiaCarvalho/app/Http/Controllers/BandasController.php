<?php

namespace App\Http\Controllers;

use App\Models\Banda;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class BandasController extends Controller
{

    public function addBandas()
    {

        $bandas = DB::table('bandas')->get();

        return view('bandas.insert_bandas',compact ('bandas'));
    }

    public function allBandas()
    {
        $bandas = $this->getBandas();

        $quantAlbuns = DB::table('bandas')
        ->join('albuns','bandas.id','=','albuns.banda_id')
        ->select(DB::raw('COUNT(albuns.id) as qtAlbuns'))
        ->groupBy('bandas.id')
        ->get();

   /*      dd('',$quantAlbuns); */


        return view('bandas.all_bandas', compact('bandas','quantAlbuns'));
    }

    private function getBandas(){

        $bandas = DB::table('bandas')
        ->get();

        return $bandas;
    }


    public function viewBandas($id){
        $myBanda = DB::table('bandas')
        ->where('bandas.id', $id)
        ->select('*')
        ->first();

        $bandas = DB::table('bandas')->get();

        return view('bandas.bandasView', compact ('myBanda','bandas'));
    }

    public function deleteBanda($id){
        DB::table('albuns')
        ->where('banda_id',$id)
        ->delete();

        DB::table('bandas')
        ->where('id',$id)
        ->delete();

        return back();
    }

    public function createBanda(Request $request){

     $request->validate([
         'nome' => 'required|string|max:20',
     ]);

     Banda::insert([
         'nome'=> $request->nome,
         'foto'=> $request->foto,
     ]);
     return redirect()->route('bandas.all')->with('message', 'Banda adicionada com sucesso!');

 }

 public function verUpdateBanda($id){
    $myBanda = DB::table('bandas')
    ->where('bandas.id', $id)
    ->select('*')
    ->first();


    return view('bandas.BandasUpdate', compact ('myBanda'));
}

 public function updateBanda(Request $request){
     $request->validate([
        'nome' => 'required|string|max:20',

     ]);

     Banda::where('id', $request->id)
     ->update([
         'nome'=> $request->nome,
         'foto'=>$request->foto,


     ]);
     return redirect()->route('bandas.all')->with('message', ' Banda atualizada!');

 }


}
