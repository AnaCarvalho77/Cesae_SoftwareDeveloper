<?php

namespace App\Http\Controllers;


use App\Models\Album;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;


class AlbunsController extends Controller
{
    public function addAlbuns()
    {

        $bandas = DB::table('bandas')->get();

        return view('albuns.insert_albuns', compact('bandas'));
    }

    public function allAlbuns()
    {
        $albuns = $this->getAlbuns();


        return view('albuns.all_albuns', compact('albuns'));
    }

    private function getAlbuns()
    {

        $albuns = DB::table('albuns')
            ->join('bandas', 'albuns.banda_id', '=', 'bandas.id')
            ->select('albuns.*', 'bandas.nome as bandaNome')
            ->get();

        return $albuns;
    }


    public function viewAlbuns($id)
    {
        $myAlbum = DB::table('albuns')
            ->where('albuns.id', $id)
            ->leftjoin('bandas', 'albuns.banda_id', '=', 'bandas.id')
            ->select('albuns.*', 'bandas.nome as bandaNome')
            ->first();


        $bandas = DB::table('bandas')->get();

        return view('albuns.albunsView', compact('myAlbum', 'bandas'));
    }

    public function deleteAlbum($id)
    {
        DB::table('albuns')
            ->where('id', $id)
            ->delete();

        return back();
    }

    public function createAlbum(Request $request)
    {

        $request->validate([
            'nome' => 'required|string|max:20',
            'banda_id' => 'required|integer|exists:bandas,id'
        ]);

        Album::insert([
            'nome' => $request->nome,
            'imagem' => $request->imagem,
            'data_lancamento' => $request->data_lancamento,
            'banda_id' => $request->banda_id
        ]);
        return redirect()->route('albuns.all_albuns')->with('message', 'Album adicionado com sucesso!');

    }

    public function verUpdateAlbum($id)
    {
        $myAlbum = DB::table('albuns')
            ->where('albuns.id', $id)
            ->leftjoin('bandas', 'albuns.banda_id', '=', 'bandas.id')
            ->select('albuns.*', 'bandas.nome as bandaNome')
            ->first();

        $bandas = DB::table('bandas')->get();

        return view('albuns.AlbunsUpdate', compact('myAlbum', 'bandas'));
    }

    public function updateAlbum(Request $request)
    {
        $request->validate([
            'nome' => 'required|string|max:20',

        ]);

        Album::where('id', $request->id)
            ->update([
                'nome' => $request->nome,
                'imagem' => $request->imagem,
                'data_lancamento' => $request->data_lancamento,
                'banda_id' => $request->banda_id
            ]);

        return redirect()->route('albuns.all')->with('message', ' Album atualizado!');

    }
}
