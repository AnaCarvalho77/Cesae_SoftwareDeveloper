//
//  ViewController.swift
//  03_PrimeiraApp
//
//  Created by Ana Sofia Carvalho on 15/01/2024.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var image: UIImageView!
    var imagens:[UIImage]=[UIImage(named:"fox")!, UIImage(named: "lion")!,UIImage(named:"monkey")!,UIImage(named:"pig")!]
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func butaoClicado(_ sender: UIButton) {
//        print("Botão Clicado!")
//        image.image = UIImage(named: "lion")
    
        var i = Int.random(in: 0...3)
        let imagemSelecionda = imagens[i]
       
        
        image.image = imagemSelecionda
    }
    
  
    @IBAction func botaoFox(_ sender: UIButton) {
        trocaImagem(nome: "fox")
        
    }
    
    @IBAction func botaoLion(_ sender: UIButton) {
        trocaImagem(nome: "lion")
    }
    
    
    @IBAction func botaoMonkey(_ sender: UIButton) {
        trocaImagem(nome: "monkey")
    }
    
    @IBAction func botaoPig(_ sender: UIButton) {
        trocaImagem(nome: "pig")
    }
    
    
    func trocaImagem(nome:String){
        image.image = UIImage(named:nome)
    }
    
    
}

