//
//  ViewController.swift
//  SecondScreen_EX04
//
//  Created by Ana Sofia Carvalho on 31/01/2024.
//

import UIKit

class ViewController: UIViewController {
    var euros : Double = 0.00

    @IBOutlet weak var eurosText: UITextField!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        // Do any additional setup after loading the view.
    }
    
    func converter(simbolo: String, moeda: String, taxa: Double){
        if let valor = Double(eurosText.text ?? ""){
            euros = valor
            let conversion = euros * taxa
            showAlert(message: "\(simbolo)\(conversion) \(moeda)")
        }
    }
    
    func showAlert(message:String){
        let alert = UIAlertController(title: "Conversion", message: message, preferredStyle: UIAlertController.Style.alert)
        
        alert.addAction(UIAlertAction(title: "Ok", style: UIAlertAction.Style.default, handler: nil))
        
        self.present(alert, animated: true, completion: nil)
    }
    
     
    @IBAction func reaisButtonClicked(_ sender: Any) {
        converter(simbolo: "R$", moeda: "Reais", taxa: 4.4)
        
    }
    

    @IBAction func dolaresButtonClicked(_ sender: Any) {
        converter(simbolo: "$" ,moeda: "Dólares", taxa:   1.2  )
    }
    
    
    
    @IBAction func pesosButtonClicked(_ sender: Any) {
        converter(simbolo: "$", moeda: "Pesos", taxa: 31.5)
    }
    
   
   
    
}

