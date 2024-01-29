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
    
    @IBOutlet weak var helloButton: UIButton!
    @IBOutlet weak var textResultado: UILabel!
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    
    @IBAction func helloButtonClicado(_ sender: Any) {
        guard let firstName = firstName.text else {return}
        guard let lastName = lastName.text else {return}
        if firstName.isEmpty && lastName.isEmpty {
            textResultado.text = "nenhum nome foi inserido!"
            helloButton.setTitle("nenhum nome", for: .normal)
        }else if firstName.isEmpty {
            textResultado.text = "primeiro nome não inserido!"
        }else if lastName.isEmpty {
            textResultado.text = "último nome não inserido!"
        }else{
            helloButton.setTitle("Dizer Olá", for:.normal)
            textResultado.text = "Olá \(firstName) \(lastName)"
        }
        
    }
  
    
    
}

