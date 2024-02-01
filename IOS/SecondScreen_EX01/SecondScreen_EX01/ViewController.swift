//
//  ViewController.swift
//  SecondScreen_EX01
//
//  Created by Ana Sofia Carvalho on 31/01/2024.
//

import UIKit

class ViewController: UIViewController {
    var username = "user"
    var password = "pass"
    var usernameRecebido = ""
    var passwordRecebido = ""

    @IBOutlet weak var invalidLabel: UILabel!
    @IBOutlet weak var passwordText: UITextField!
    @IBOutlet weak var usernameText: UITextField!
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func loginButtonClicked(_ sender: Any) {
        usernameRecebido = usernameText.text!
        passwordRecebido = passwordText.text!
        
        if(usernameRecebido == username && passwordRecebido == password){
            performSegue(withIdentifier: "toSecondVC", sender: nil)
        }
        else{
            invalidLabel.text = "Login Inválido"
        }
    }
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if segue.identifier == "toSecondVC" {
            let destinationVC = segue.destination as! SecondViewController
            
            destinationVC.welcomeText = "WELCOME \(usernameRecebido)"
            
        }
    }
    
}

