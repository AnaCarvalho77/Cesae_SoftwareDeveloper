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
      /*   db::table('users')
        ->updateOrInsert(
            [
                'email'=> 'gabriel@gmail.com'
            ],
            [
            'name'=> 'Gabriel',
            'password'=>'gabrielpass',
            'updated_at'=>now(),
            'created_at'=>now(),
        ]);


        $users = DB::table('users')->get();
        $myUser = DB::table('users')->where('password', '123')->first(); */

       /*  dd($myUser); *///ver os users antes de mandar as coisas para a view

        return view('users.adicionarUtilizadores');
    }


    public function createUser(Request $request){

           /*  if($request->id){

            }else{

            } */


        $request->validate([
            'email' => 'required|unique:users',
            'name' => 'required|string|max:10',
        ]);

        User::insert([
            'name'=> $request->name,
            'email'=> $request->email,
            'password'=> Hash::make($request->password),
        ]);
        return redirect()->route('users.all')->with('message', 'Boa, utilizador adicionado com sucesso!');

    }

    public function updateUser(Request $request){
        $request->validate([
            'phone' => 'min:9|max:14',
        ]);

        User::where('id', $request->id)
        ->update([
            'name'=> $request->name,
            'address'=>$request->address,
            'phone'=>$request->phone,

        ]);
        return redirect()->route('users.all')->with('message', ' utilizador atualizado!');

    }




    public function allUsers()
    {
        $hello = 'Finalmente vamos para código';
        $helloAgain = 'cucu';
        $daysOfWeek = $this->getWeekDays();
        $infoPodeNomeDiferente = $this->info();
        $users = $this->getUsers();



    //var_dump($infoPodeSerNomeDiferente);
    //dd($infoPodeSerNomeDiferente);

        return view('users.all_users', compact('hello', 'helloAgain', 'daysOfWeek','infoPodeNomeDiferente','users'));
    }

    private function getWeekDays(){
        $daysOfWeek = ['Segunda', 'Terça', 'Quarta','Quinta'];
        return $daysOfWeek;

    }

    private function info(){
        //array associativo
        $courseInfo = [
            'name' => 'Software Developer', //aqui chamas pela key
            'year' => 2024,
            'modules' => ['PHP', 'WebServices', 'Java'],
            //aqui chama-se pela posicao do array associativo e a posicao do proprio array
            //como é primeiro array sem key é a posicao '0'
            ['Teste',4,'Sofia', 'Joao']
        ];
        return $courseInfo;
    }

    private function getUsers(){
        //array associativo
        // $users = [
        //     ['id' => 1,'name'=> 'Sara', 'phone'=>'985654455', 'email'=>'sara@gmail.com'],
        //     ['id' => 2,'name'=> 'Bruno', 'phone'=>'985654455','email'=>'bruno@gmail.com'],
        //     ['id' => 3,'name'=> 'Márcia', 'phone'=>'985654455','email'=>'marcia@gmail.com']
        // ];

        //onde não é nulo
        // $users = DB::table('users')
        // ->whereNotNull('updated_at')
        // ->get();

        //onde é nulo
        // $users = DB::table('users')
        // ->whereNull('updated_at')
        // ->get();

        $users = DB::table('users')
        ->get();

        //usando os modelos e não o DB
        // $users = User::get();
        // $adminType = User::TYPE_ADMIN;

        return $users;
    }

    public function viewUser($id){
        $myUser = DB::table('users')
        ->where('id', $id)
        ->first();

        return view('users.usersView', compact ('myUser'));
    }

    public function deleteUser($id){
        DB::table('tasks')
        ->where('user_id',$id)
        ->delete();

        DB::table('users')
        ->where('id',$id)
        ->delete();

        return back();
    }





}
