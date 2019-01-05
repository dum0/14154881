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
    
    

    
    @IBOutlet weak var planeView: DraggedImageView!
    func changeSomething() {
        collisionBehavior.removeAllBoundaries()
        self.collisionBehavior.addBoundary(withIdentifier: "PlayerPlane" as NSCopying, for: UIBezierPath(rect: self.planeView.frame))
        
       /* for birdView in ScoresArray {
            if (planeView.frame.intersects(birdView.frame)){
                Scores = Scores - 2
                self.GameScore.text = String (self.Scores)
            }
        }*/
        
        
    }
    
    var roadView = UIImageView(image: UIImage(named: "road1.png"))
   
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
        
        var birdArray: [UIImage]!
        
        //declare an array of UIImageView: birdView[10]
        
        //use a loop to generate these imageViews individually birdView[i]
        
        var birdView = UIImageView(image: nil)
        
        birdView.frame = CGRect(x: 500, y: 100, width: 30, height: 50)
        self.view.addSubview(birdView)
        birdArray = [UIImage(named: "bird1.png")!, UIImage(named: "bird2.png")!,UIImage(named: "bird3.png")!,UIImage(named: "bird4.png")!,UIImage(named: "bird5.png")!,UIImage(named: "bird6.png")!,UIImage(named: "bird7.png")!, UIImage(named: "bird8.png")!,UIImage(named: "bird9.png")!,UIImage(named: "bird10.png")!]
            birdView.image = UIImage.animatedImage(with: birdArray, duration: 0)
        
        var birdView2 = UIImageView(image: nil)
        birdView2.frame = CGRect(x: 500, y: 0, width: 30, height: 50)
        self.view.addSubview(birdView2)
        birdView2.image = UIImage.animatedImage(with: birdArray, duration: 1)
        
        var birdView3 = UIImageView(image: nil)
        birdView3.frame = CGRect(x: 500, y: 50, width: 30, height: 50)
        self.view.addSubview(birdView3)
            birdView3.image = UIImage.animatedImage(with: birdArray, duration: 1)


        //UKKit dynamics --> movement with linear velocity
        dynamicAnimator = UIDynamicAnimator(referenceView: self.view)
        
        dynamicItemBehavior = UIDynamicItemBehavior(items: [birdView])
        self.dynamicItemBehavior.addLinearVelocity(CGPoint(x: UIScreen.main.bounds.width, y: 100), for: birdView)
        dynamicAnimator.addBehavior(dynamicItemBehavior)
        
        dynamicItemBehavior = UIDynamicItemBehavior(items: [birdView2])
        self.dynamicItemBehavior.addLinearVelocity(CGPoint(x: UIScreen.main.bounds.width, y: 0), for: birdView2)
        dynamicAnimator.addBehavior(dynamicItemBehavior)
        
        dynamicItemBehavior = UIDynamicItemBehavior(items: [birdView3])
        self.dynamicItemBehavior.addLinearVelocity(CGPoint(x: UIScreen.main.bounds.width, y: 50), for: birdView3)
        dynamicAnimator.addBehavior(dynamicItemBehavior)
        
      
        
        collisionBehavior = UICollisionBehavior(items:[birdView, birdView2, birdView3])
        collisionBehavior.translatesReferenceBoundsIntoBoundary = true
            dynamicAnimator.addBehavior(collisionBehavior)
    
        _ = UIScreen.main.bounds.width
        _ = UIScreen.main.bounds.height
        
        
        
        self.roadView = UIImageView (frame: CGRect(x:0, y:0, width: 0.05, height: 0.3))
       
        let when = DispatchTime.now() + 20
        DispatchQueue.main.asyncAfter(deadline: when) {
            self.planeView.removeFromSuperview()
            birdView.removeFromSuperview()
            birdView2.removeFromSuperview()
            birdView3.removeFromSuperview()
            treeView.removeFromSuperview()
            cloudView.removeFromSuperview()
            var Restart = UIImageView(image: nil)
            Restart.image = UIImage(named: "replay.png")
            Restart.frame = CGRect(x:250, y: 150, width: 50, height: 20)
            self.view.addSubview(Restart)
            
        }
        
        
        }
    
    

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
}

