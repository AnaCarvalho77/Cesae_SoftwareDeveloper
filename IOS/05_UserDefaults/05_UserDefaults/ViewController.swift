//
//  ViewController.swift
//  05_UserDefaults
//
//  Created by Ana Sofia Carvalho on 29/01/2024.
//

import UIKit

class ViewController: UIViewController {

  
    @IBOutlet weak var editUserName: UITextField!
    @IBOutlet weak var labelName: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }


    @IBAction func buttonCkeckClicked(_ sender: Any) {
        let savedName = UserDefaults.standard.object(forKey: "name")
        
        if let newName = savedName as? String{
            labelName.text = newName
        }else{
            labelName.text = "No name"
        }
        
    }
    @IBAction func buttonSaveClicked(_ sender: Any) {
        labelName.text = "Name: \(editUserName.text!)"
        UserDefaults.standard.setValue(editUserName.text, forKey: "name")
        
    }
    
    @IBAction func buttonDeleteClicked(_ sender: Any) {
        let StoredName = UserDefaults.standard.object(forKey: "name")
        
        if(StoredName as? String) != nil{
            UserDefaults.standard.removeObject(forKey: "name")
            labelName.text = "No name"
        }
    }
    
    
    
}

