//
//  ViewController.swift
//  cw1project
//
//  Created by dm15abg on 22/11/2018.
//  Copyright © 2018 CSStestuser. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    var dynamicAnimator: UIDynamicAnimator!
    var collisionBehavior: UICollisionBehavior!
    var gravityBehavior: UIGravityBehavior!
    var dynamicItemBehavior: UIDynamicItemBehavior!
    
    @IBOutlet weak var planeView: DraggedImageView!
    var roadView = UIImageView(image: UIImage(named: "road1.png"))
    var birdView = UIImageView(image: nil)
    

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        var imageArray: [UIImage]!
        var planeArray: [UIImage]!
        var birdArray: [UIImage]!
        
        roadView.frame = UIScreen.main.bounds
        self.view.addSubview(roadView)
        
        birdView.image = UIImage(named: "bird1.png")
        birdView.frame = CGRect(x: 500, y: 100, width: 30, height: 50)
        self.view.addSubview(birdView)
        
        let RandomBirdArray = [1,2,3]
        for index in 0...2 {
            let delay = Double(RandomBirdArray[index])
            let when = DispatchTime.now() + delay
            //let screenWidth = UIScreen.main.bounds.width
            
        DispatchQueue.main.asyncAfter(deadline: when){
                let birdNum = arc4random_uniform(3)
                let RandomBird = UIImageView(image: nil)
                
                switch birdNum {
                case 1: RandomBird.image = UIImage(named:"bird1.png")
                case 2: RandomBird.image = UIImage(named:"bird1.png")
                case 3: RandomBird.image = UIImage(named:"bird1.png")
                default: RandomBird.image = UIImage(named: "bird1.png")
                
                RandomBird.image = UIImage.animatedImage(with: birdArray, duration: 0)
                
                }
            
            RandomBird.frame = CGRect(x:500, y:100, width: 30, height:50)
            self.view.addSubview(RandomBird)
            self.view.bringSubview(toFront: RandomBird)
            
            }
        }
        
        

        self.view.bringSubview(toFront: planeView)
       
        
        imageArray = [UIImage(named:"road1.png")!,
                      UIImage(named:"road1.png")!,UIImage(named:"road2.png")!,UIImage(named:"road3.png")!,UIImage(named:"road4.png")!,UIImage(named:"road5.png")!,UIImage(named:"road6.png")!,UIImage(named:"road7.png")!,UIImage(named:"road8.png")!,UIImage(named:"road9.png")!,UIImage(named:"road10.png")!,UIImage(named:"road11.png")!,UIImage(named:"road12.png")!,UIImage(named:"road13.png")!,UIImage(named:"road14.png")!,UIImage(named:"road15.png")!,UIImage(named:"road16.png")!,UIImage(named:"road17.png")!,UIImage(named:"road18.png")!,UIImage(named:"road19.png")!]
        
        
        
        planeArray = [UIImage(named: "plane1.png")!,
                      UIImage(named: "plane2.png")!,
                      UIImage(named: "plane3.png")!,
                      UIImage(named: "plane4.png")!,
                      UIImage(named: "plane5.png")!,
                      UIImage(named: "plane6.png")!,
                      UIImage(named: "plane7.png")!,
                      UIImage(named: "plane8.png")!,
                      UIImage(named: "plane9.png")!,
                      UIImage(named: "plane10.png")!,
                      UIImage(named: "plane11.png")!,
                      UIImage(named: "plane12.png")!,
                      UIImage(named: "plane13.png")!,
                      UIImage(named: "plane14.png")!,
                      UIImage(named: "plane15.png")!
        ]
        
        birdArray = [UIImage(named: "bird1.png")!, UIImage(named: "bird2.png")!,UIImage(named: "bird3.png")!,UIImage(named: "bird4.png")!,UIImage(named: "bird5.png")!,UIImage(named: "bird6.png")!,UIImage(named: "bird7.png")!, UIImage(named: "bird8.png")!,UIImage(named: "bird9.png")!,UIImage(named: "bird10.png")!]
        
        
        
        
        
        
        roadView.image = UIImage.animatedImage(with: imageArray, duration: 1)
        
        planeView.image = UIImage.animatedImage(with: planeArray, duration: 0)
        birdView.image = UIImage.animatedImage(with: birdArray, duration: 0)
        
    
        
        dynamicAnimator = UIDynamicAnimator(referenceView: self.view)
        
        
        
        collisionBehavior = UICollisionBehavior(items:[birdView])
        collisionBehavior.translatesReferenceBoundsIntoBoundary = true
        dynamicAnimator.addBehavior(collisionBehavior)
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

