<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UsersController extends Controller
{


    public function addUsers()
    {
        return view('users.adicionarUtilizadores');
    }

    public function allUsers()
    {
        $hello = 'Finalmente vamos para código';
        $helloAgain = 'cucu';
        $daysOfWeek = $this->getWeekDays();
        $infoPodeNomeDiferente = $this->info();
        $contacts = $this->getContacts();

    //var_dump($infoPodeSerNomeDiferente);
    //dd($infoPodeSerNomeDiferente);
       
        return view('users.all_users', compact('hello', 'helloAgain', 'daysOfWeek','infoPodeNomeDiferente','contacts'));
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

    private function getContacts(){
        //array associativo
        $contacts = [
            ['id' => 1,'name'=> 'Sara', 'phone'=>'985654455', 'email'=>'sara@gmail.com'],
            ['id' => 2,'name'=> 'Bruno', 'phone'=>'985654455','email'=>'bruno@gmail.com'],
            ['id' => 3,'name'=> 'Márcia', 'phone'=>'985654455','email'=>'marcia@gmail.com']
        ];
        return $contacts;
    }


}
