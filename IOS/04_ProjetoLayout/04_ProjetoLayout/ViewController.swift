//
//  ViewController.swift
//  04_ProjetoLayout
//
//  Created by Ana Sofia Carvalho on 22/01/2024.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var firstName: UITextField!
    
    @IBOutlet weak var lastName: UITextField!
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    
    
    @IBAction func helloButton(_ sender: UIButton) {
    
        let firstName = firstName.text
        let lastName = lastName.text
        print("Olá \(firstName)) \(lastName))")
        
    }
    
    
}

