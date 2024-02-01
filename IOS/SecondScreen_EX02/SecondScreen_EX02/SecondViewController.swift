//
//  SecondViewController.swift
//  SecondScreen_EX02
//
//  Created by Ana Sofia Carvalho on 31/01/2024.
//

import UIKit

class SecondViewController: UIViewController {
    var welcomeText: String = ""
    
    
    @IBOutlet weak var welcomeLabel: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        welcomeLabel.text = welcomeText
        // Do any additional setup after loading the view.
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
