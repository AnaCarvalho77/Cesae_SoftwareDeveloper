<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class DashboardController extends Controller
{
    public function __construct(){
        $this->middleware(['auth']);
    }

    public function index()
    {

        $message=null;

        $isAdmin = Auth::user()->user_type == User::TYPE_ADMIN ? true : false;

        if($isAdmin){
            $message = 'Administrador';
        }
        return view('dashboard.home', compact ('message'));
    }


}
