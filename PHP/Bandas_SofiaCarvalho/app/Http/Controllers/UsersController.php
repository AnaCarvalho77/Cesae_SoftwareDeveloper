<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;

class UsersController extends Controller
{
    public function addUsers()
    {
        return view('users.adicionarUtilizadores');
    }
    public function createUser(Request $request)
    {

        $request->validate([
            'email' => 'required|unique:users',
            'name' => 'required|string|max:10',
        ]);
        if ($request->hasFile('foto')) {
            $foto = $request->file('foto')->get();
        } else {
            return redirect()->back()->withInput()->withErrors(['foto' => 'Nenhum arquivo de imagem foi enviado.']);
        }


        User::insert([
            'name' => $request->name,
            'email' => $request->email,
            'password' => Hash::make($request->password),
            'foto' => $foto,

        ]);
        return redirect()->route('users.all')->with('message', 'Boa, utilizador adicionado com sucesso!');

    }

    public function viewUser($id)
    {
        $myUser = DB::table('users')
            ->where('id', $id)
            ->first();

        return view('users.usersView', compact('myUser'));
    }
    public function verUpdateUser($id)
    {
        $myUser = DB::table('users')
            ->where('id', $id)
            ->first();

        return view('users.usersUpdate', compact('myUser'));

    }

    public function updateUser(Request $request)
    {
        $request->validate([
            'phone' => 'min:9|max:14',
        ]);


        User::where('id', $request->id)
            ->update([
                'name' => $request->name,
                'address' => $request->address,
                'phone' => $request->phone,

            ]);
        return redirect()->route('users.all')->with('message', ' utilizador atualizado!');

    }




    public function allUsers()
    {

        $search = request()->query('search') ? request()->query('search') : null;
        /*  dd(request()->query('search')); */

        $users = DB::table('users');
        if ($search) {

            $users->where('name', 'like', "%{$search}%");
            $users->orWhere('email', 'like', "%{$search}%");
        }


        $users = $users->get();

        return view('users.all_users', compact('users'));
    }




    private function getUsers()
    {
        $users = DB::table('users')
            ->get();
        return $users;
    }


    public function deleteUser($id)
    {
        DB::table('users')
            ->where('id', $id)
            ->delete();

        return back();
    }


}
