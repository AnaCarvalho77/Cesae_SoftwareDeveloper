//
//  ViewController.swift
//  SecondScreen_EX02
//
//  Created by Ana Sofia Carvalho on 31/01/2024.
//

import UIKit

class ViewController: UIViewController {
    var username = "user"
    var password = "pass"
    
    var usernameRecebido = ""
    var passwordRecebida = ""
    

    @IBOutlet weak var passwordText: UITextField!
    @IBOutlet weak var usernameText: UITextField!
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    
    override func viewWillAppear(_ animated: Bool) {
        usernameText.text = ""
        passwordText.text = ""
    }

    @IBAction func loginButtonClicked(_ sender: Any) {
        
        usernameRecebido = usernameText.text!
        passwordRecebida = passwordText.text!
        
        if(usernameRecebido == username && passwordRecebida == password){
            performSegue(withIdentifier: "toSecondVC", sender: nil)
        }
        else{
            let alert = UIAlertController(title: "Alert", message: "Invalid Login", preferredStyle: UIAlertController.Style.alert)
            
            alert.addAction(UIAlertAction(title: "Ok", style: UIAlertAction.Style.default, handler: nil))
            
            self.present(alert, animated: true, completion: nil)
        }
    }
    
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if segue.identifier == "toSecondVC" {
            let destinationVC = segue.destination as! SecondViewController
            
            destinationVC.welcomeText = "WELCOME \(usernameRecebido)"
            
        }
    }
    
}

