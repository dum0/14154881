//
//  ViewController.swift
//  cw1project
//
//  Created by dm15abg on 22/11/2018.
//  Copyright © 2018 CSStestuser. All rights reserved.
//

import UIKit
protocol subviewDelegate {
    func changeSomething()
}



class ViewController: UIViewController, subviewDelegate{
    
    var dynamicAnimator: UIDynamicAnimator!
    var collisionBehavior: UICollisionBehavior!
    var gravityBehavior: UIGravityBehavior!
    var dynamicItemBehavior: UIDynamicItemBehavior!
    var planeAnimator: UIDynamicAnimator!
    var ScoresArray: [UIImageView] = []
    var planes: [UIImageView] = []
    var score = 0
    
    @IBOutlet weak var gameover: UIView!
    @IBOutlet weak var highscore: UILabel!
    @IBAction func restart(_ sender: UIButton) {
        self.viewDidLoad()
        self.gameover.alpha = 0
        score = 0
        
    }
    
    @IBOutlet weak var planeView: DraggedImageView!
    func changeSomething() {
        collisionBehavior.removeAllBoundaries()
        self.collisionBehavior.addBoundary(withIdentifier: "PlayerPlane" as NSCopying, for: UIBezierPath(rect: self.planeView.frame))
        
    }
    let W = UIScreen.main.bounds.width
    let H = UIScreen.main.bounds.height
    
    var roadView = UIImageView(image: UIImage(named: "road1.png"))
   let birdArray1 = [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
   let birdArray2 = [3, 6, 15, 18]
   let coinArray1 = [1, 5, 7, 9, 11, 13, 15, 17, 19, 21]
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
       
        
        
        
        var imageArray: [UIImage]!
        roadView.frame = UIScreen.main.bounds
        self.view.addSubview(roadView)
        imageArray = [UIImage(named:"road1.png")!,
                      UIImage(named:"road1.png")!,UIImage(named:"road2.png")!,UIImage(named:"road3.png")!,UIImage(named:"road4.png")!,UIImage(named:"road5.png")!,UIImage(named:"road6.png")!,UIImage(named:"road7.png")!,UIImage(named:"road8.png")!,UIImage(named:"road9.png")!,UIImage(named:"road10.png")!,UIImage(named:"road11.png")!,UIImage(named:"road12.png")!,UIImage(named:"road13.png")!,UIImage(named:"road14.png")!,UIImage(named:"road15.png")!,UIImage(named:"road16.png")!,UIImage(named:"road17.png")!,UIImage(named:"road18.png")!,UIImage(named:"road19.png")!]
        roadView.image = UIImage.animatedImage(with: imageArray, duration: 1)
        
        var cloudView = UIImageView(image:nil)
        cloudView.image = UIImage(named: "cloud.png")
        cloudView.frame = CGRect(x:0, y: 50, width: 300, height: 200)
        self.view.addSubview(cloudView)
        
        var treeArray: [UIImage]!
        var treeView = UIImageView(image: nil)
        treeView.image = UIImage(named: "tree1.png")
        treeView.frame = CGRect(x:0, y:110, width: UIScreen.main.bounds.width, height: 140)
        self.view.addSubview(treeView)
        
        
        treeArray = [UIImage(named: "tree1.png")!,UIImage(named: "tree2.png")!,UIImage(named: "tree3.png")!,UIImage(named: "tree4.png")!,UIImage(named: "tree5.png")!,UIImage(named: "tree6.png")!,UIImage(named: "tree7.png")!,UIImage(named: "tree8.png")!,UIImage(named: "tree9.png")!,UIImage(named: "tree10.png")!,UIImage(named: "tree11.png")!,UIImage(named: "tree12.png")!,UIImage(named: "tree13.png")!,UIImage(named: "tree14.png")!,UIImage(named: "tree15.png")!,UIImage(named: "tree16.png")!,UIImage(named: "tree17.png")!,]
        treeView.image = UIImage.animatedImage(with: treeArray, duration: 2)
        
        
        
        var planeArray: [UIImage]!
        self.view.bringSubview(toFront: planeView)
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
        planeView.image = UIImage.animatedImage(with: planeArray, duration: 0)
        
        planeView.myDelegate = self
        planeAnimator = UIDynamicAnimator(referenceView: self.view)
        dynamicItemBehavior = UIDynamicItemBehavior(items:[])
        collisionBehavior = UICollisionBehavior(items:[])
        
        planeAnimator.addBehavior(dynamicItemBehavior)
        collisionBehavior = UICollisionBehavior(items:[])
        collisionBehavior.translatesReferenceBoundsIntoBoundary = false
        planeAnimator.addBehavior(collisionBehavior)
        
        for index in 0...3{
            let delay = Double(self.birdArray1[index])
            let release = DispatchTime.now() + delay
            DispatchQueue.main.asyncAfter(deadline: release){
                let birdImage1 = UIImageView(image: nil)
                var birdImageArray1: [UIImage]
                
                birdImageArray1 = [UIImage(named: "bird1.png")!,
                                   UIImage(named: "bird2.png")!,
                                   UIImage(named: "bird3.png")!,
                                   UIImage(named: "bird4.png")!,
                                   UIImage(named: "bird5.png")!,
                                   UIImage(named: "bird6.png")!,
                                   UIImage(named: "bird7.png")!,
                                   UIImage(named: "bird8.png")!,
                                   UIImage(named: "bird9.png")!,
                                   UIImage(named: "bird10.png")!]
                birdImage1.image = UIImage.animatedImage(with: birdImageArray1, duration: 1)
                birdImage1.frame = CGRect(x: self.W, y:CGFloat (arc4random_uniform(UInt32(self.H)-50)), width: self.W*(0.125), height: self.H*(0.1))
                
                self.view.addSubview(birdImage1)
                self.view.bringSubview(toFront: birdImage1)
                self.dynamicItemBehavior.addItem(birdImage1)
                self.dynamicItemBehavior.addLinearVelocity(CGPoint(x: -300, y: 0), for: birdImage1)
                self.collisionBehavior.addItem(birdImage1)
                
                
                
                
            }
        }
        
        for index in 0...3{
            let delay = Double(self.birdArray2[index])
            let release = DispatchTime.now() + delay
            DispatchQueue.main.asyncAfter(deadline: release){
                let birdImage2 = UIImageView(image: nil)
                var birdImageArray2: [UIImage]
                
                birdImageArray2 = [UIImage(named: "bird1.png")!,
                                   UIImage(named: "bird2.png")!,
                                   UIImage(named: "bird3.png")!,
                                   UIImage(named: "bird4.png")!,
                                   UIImage(named: "bird5.png")!,
                                   UIImage(named: "bird6.png")!,
                                   UIImage(named: "bird7.png")!,
                                   UIImage(named: "bird8.png")!,
                                   UIImage(named: "bird9.png")!,
                                   UIImage(named: "bird10.png")!]
                birdImage2.image = UIImage.animatedImage(with: birdImageArray2, duration: 1)
                birdImage2.frame = CGRect(x: self.W, y:CGFloat (arc4random_uniform(UInt32(self.H)-50)), width: self.W*(0.125), height: self.H*(0.1))
                
                self.view.addSubview(birdImage2)
                self.view.bringSubview(toFront: birdImage2)
                self.dynamicItemBehavior.addItem(birdImage2)
                self.dynamicItemBehavior.addLinearVelocity(CGPoint(x: -300, y: 0), for: birdImage2)
                self.collisionBehavior.addItem(birdImage2)
                
                self.collisionBehavior.action = {
                    if(birdImage2.frame.intersects(self.planeView.frame)){
                       self.score -= 200
                    }
                }
                
                
                

            }
        }
        
        for index2 in 0...9{
            let delay = Double(self.coinArray1[index2])
            let release = DispatchTime.now() + delay
            DispatchQueue.main.asyncAfter(deadline: release) {
                let coinImage1 = UIImageView(image: nil)
                var coinImageArray1: [UIImage]
                
                coinImageArray1 = [UIImage(named: "goldCoin1.png")!,
                                   UIImage(named: "goldCoin2.png")!,
                                   UIImage(named: "goldCoin3.png")!,
                                   UIImage(named: "goldCoin4.png")!,
                                   UIImage(named: "goldCoin5.png")!,
                                   UIImage(named: "goldCoin6.png")!,
                                   UIImage(named: "goldCoin7.png")!,
                                   UIImage(named: "goldCoin8.png")!,
                                   UIImage(named: "goldCoin9.png")!]
                coinImage1.image = UIImage.animatedImage(with: coinImageArray1, duration: 1)
                coinImage1.frame = CGRect(x: self.W, y:CGFloat (arc4random_uniform(UInt32(self.H)-50)), width: self.W*(0.125), height: self.H*(0.1))
                
                self.view.addSubview(coinImage1)
                self.view.bringSubview(toFront: coinImage1)
                self.dynamicItemBehavior.addItem(coinImage1)
                self.dynamicItemBehavior.addLinearVelocity(CGPoint(x: -300, y: 0), for: coinImage1)
                self.collisionBehavior.addItem(coinImage1)
                
                self.collisionBehavior.action = {
                    if(coinImage1.frame.intersects(self.planeView.frame)) {
                        self.view.sendSubview(toBack: coinImage1)
                        self.score += 100
                    }
                }
                
                
                
            }
        }
        
        self.roadView = UIImageView (frame: CGRect(x:0, y:0, width: 0.05, height: 0.3))
       
        let when = DispatchTime.now() + 20
        DispatchQueue.main.asyncAfter(deadline: when) {
            self.view.bringSubview(toFront: self.gameover)
            self.gameover.alpha = 1
            self.gameover.frame = CGRect(x:0, y: 0, width: self.W*1, height: self.H*1)
            self.highscore.text = ("Score: " + String(self.score))
        }
        
        }
    
    

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
}

