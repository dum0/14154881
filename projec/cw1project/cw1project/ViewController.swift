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
    
    @IBOutlet weak var GameScore: UILabel!
    
    var dynamicAnimator: UIDynamicAnimator!
    var collisionBehavior: UICollisionBehavior!
    var gravityBehavior: UIGravityBehavior!
    var dynamicItemBehavior: UIDynamicItemBehavior!
    var planeAnimator: UIDynamicAnimator!
    //var cloudAnimator: UIDynamicAnimator!
    var Scores = 0;
    var GameTimer = Timer()
    var ScoresArray: [UIImageView] = []
    var planes: [UIImageView] = []
    let button = UIButton(frame: CGRect(x:140, y:100, width:120, height: 100))
    var countDown = 60
    
    /*let GameOver = UIImageView(image:nil)
    
    @objc func Replay (sender: UIButton!){
        GameScore.removeFromSuperview()
        button.removeFromSuperview()
        Scores = 0;
        
        for i in planes{
            i.removeFromSuperview()
        }
        viewDidLoad()
    }*/
    
    
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
    //var cloudView = UIImageView(image:nil)
    
    
    
    //func changeSomething() {
        //collisionBehavior.removeAllBoundaries()
        //self.collisionBehavior.addBoundary(withIdentifier: "Plane") as NSCopying, for: UIBezierPath(rect: self.DraggedImageView.frame))
        
        //for planeView in ScoresArray {
           // if (DraggedImageView.frame.intersects(RandomBird.frame)) [
            //Scores = Scores - 2
            //self.GameScore.text = String (self.Scores)]
        //}
    //}
    

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        //let time DispatchTime.now() + 60
        //DispatchQueue.main.asyncAfter(deadline: time){}
        
        let time = DispatchTime.now() + 20
        DispatchQueue.main.asyncAfter(deadline: time){}
        
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
        
        /*var cloudArray: [UIImage]!
        var cloudView = UIImageView(image: nil)
        cloudView.frame = CGRect(x: 500, y: 100, width: 30, height: 50)
        self.view.bringSubview(toFront: cloudView)
        cloudArray = [UIImage(named:"cloud.png")!,UIImage(named:"cloud2.png")!]
        cloudView.image = UIImage.animatedImage(with: cloudArray, duration: 0)
        
        planeAnimator = UIDynamicAnimator(referenceView: self.view)
        
        dynamicItemBehavior = UIDynamicItemBehavior(items: [cloudView])
        self.dynamicItemBehavior.addLinearVelocity(CGPoint(x: 500, y: 100), for: cloudView)
        planeAnimator.addBehavior(dynamicItemBehavior)*/
        
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

        /*var birdView4 = UIImageView(image: nil)
        birdView4.frame = CGRect(x: 500, y: 150, width: 30, height: 50)
        self.view.addSubview(birdView4)
        birdView4.image = UIImage.animatedImage(with: birdArray, duration: 0)

        var birdView5 = UIImageView(image: nil)
        birdView5.frame = CGRect(x: 500, y: 100, width: 30, height: 50)
        self.view.addSubview(birdView5)
        birdView5.image = UIImage.animatedImage(with: birdArray, duration: 1)

        var birdView6 = UIImageView(image: nil)
        birdView6.frame = CGRect(x: 500, y: 150, width: 30, height: 50)
        self.view.addSubview(birdView6)
        birdView6.image = UIImage.animatedImage(with: birdArray, duration: 1)

        var birdView7 = UIImageView(image: nil)
        birdView7.frame = CGRect(x: 500, y: 50, width: 30, height: 50)
        self.view.addSubview(birdView7)
        birdView7.image = UIImage.animatedImage(with: birdArray, duration: 0)
        
        var birdView8 = UIImageView(image: nil)
        birdView8.frame = CGRect(x: 500, y: 150, width: 30, height: 50)
        self.view.addSubview(birdView8)
        birdView8.image = UIImage.animatedImage(with: birdArray, duration: 1)

        var birdView9 = UIImageView(image: nil)
        birdView9.frame = CGRect(x: 500, y: 100, width: 30, height: 50)
        self.view.addSubview(birdView9)
        birdView9.image = UIImage.animatedImage(with: birdArray, duration: 1)
    
        var birdView10 = UIImageView(image: nil)
        birdView10.frame = CGRect(x: 500, y: 150, width: 30, height: 50)
        self.view.addSubview(birdView10)
            birdView10.image = UIImage.animatedImage(with: birdArray, duration: 0)*/

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
        
        /*dynamicItemBehavior = UIDynamicItemBehavior(items: [birdView4])
        self.dynamicItemBehavior.addLinearVelocity(CGPoint(x: 500, y: 150), for: birdView4)
        dynamicAnimator.addBehavior(dynamicItemBehavior)
        
        dynamicItemBehavior = UIDynamicItemBehavior(items: [birdView5])
        self.dynamicItemBehavior.addLinearVelocity(CGPoint(x: 400, y: 100), for: birdView5)
        dynamicAnimator.addBehavior(dynamicItemBehavior)
        
        dynamicItemBehavior = UIDynamicItemBehavior(items: [birdView6])
        self.dynamicItemBehavior.addLinearVelocity(CGPoint(x: 600, y: 150), for: birdView6)
        dynamicAnimator.addBehavior(dynamicItemBehavior)
        
        dynamicItemBehavior = UIDynamicItemBehavior(items: [birdView7])
        self.dynamicItemBehavior.addLinearVelocity(CGPoint(x: 400, y: 50), for: birdView7)
        dynamicAnimator.addBehavior(dynamicItemBehavior)
        
        dynamicItemBehavior = UIDynamicItemBehavior(items: [birdView8])
        self.dynamicItemBehavior.addLinearVelocity(CGPoint(x: 400, y: 150), for: birdView8)
        dynamicAnimator.addBehavior(dynamicItemBehavior)
        
        dynamicItemBehavior = UIDynamicItemBehavior(items: [birdView9])
        self.dynamicItemBehavior.addLinearVelocity(CGPoint(x: 600, y: 100), for: birdView9)
        dynamicAnimator.addBehavior(dynamicItemBehavior)
        
        dynamicItemBehavior = UIDynamicItemBehavior(items: [birdView10])
        self.dynamicItemBehavior.addLinearVelocity(CGPoint(x: 400, y: 150), for: birdView10)
            dynamicAnimator.addBehavior(dynamicItemBehavior)*/
        
        collisionBehavior = UICollisionBehavior(items:[birdView, birdView2, birdView3])
        collisionBehavior.translatesReferenceBoundsIntoBoundary = true
            dynamicAnimator.addBehavior(collisionBehavior)
        
       /* self.ScoresArray.append((birdView))
        self.Scores += 2
        self.GameScore.text = String(self.Scores)*/
        
        _ = UIScreen.main.bounds.width
        _ = UIScreen.main.bounds.height
        
        /*let finishGame = DispatchTime.now() + 20
        DispatchQueue.main.asyncAfter(deadline: finishGame) {
            let end = self.storyboard?.instantiateViewController(withIdentifier: "ViewController2") as! ViewController
            end.finalScore = self.GameScore.text!
            
            self.show(end, sender: nil)
        }*/
        
            self.roadView = UIImageView (frame: CGRect(x:0, y:0, width: 0.05, height: 0.3))
        
        /*let finishGame = DispatchTime.now() + 20
        DispatchQueue.main.asyncAfter(deadline: finishGame) {
            let end = self.storyboard?.instantiateInitialViewController(withIdentifier: "ViewController2") as! ViewController2
            end.finalScore = self.GameScore.text!
            
            self.show(end, sender: nil)
            
        }*/
        
        //gravityBehavior = UIGravityBehavior(items: [birdView])
        //dynamicAnimator.addBehavior(gravityBehavior)
        
        //collisionBehavior = UICollisionBehavior(items:[birdView2])
        //collisionBehavior.translatesReferenceBoundsIntoBoundary = true
        //dynamicAnimator.addBehavior(collisionBehavior)
        
       // gravityBehavior = UIGravityBehavior(items: [birdView2])
        //dynamicAnimator.addBehavior(gravityBehavior)
        
        //collisionBehavior = UICollisionBehavior(items:[birdView3])
        //collisionBehavior.translatesReferenceBoundsIntoBoundary = true
        //dynamicAnimator.addBehavior(collisionBehavior)
        
        //gravityBehavior = UIGravityBehavior(items: [birdView3])
        //dynamicAnimator.addBehavior(gravityBehavior)
        
        /*collisionBehavior = UICollisionBehavior(items:[birdView4])
        collisionBehavior.translatesReferenceBoundsIntoBoundary = true
        dynamicAnimator.addBehavior(collisionBehavior)
        
        collisionBehavior = UICollisionBehavior(items:[birdView5])
        collisionBehavior.translatesReferenceBoundsIntoBoundary = true
        dynamicAnimator.addBehavior(collisionBehavior)
        
        collisionBehavior = UICollisionBehavior(items:[birdView6])
        collisionBehavior.translatesReferenceBoundsIntoBoundary = true
        dynamicAnimator.addBehavior(collisionBehavior)
        
        collisionBehavior = UICollisionBehavior(items:[birdView7])
        collisionBehavior.translatesReferenceBoundsIntoBoundary = true
        dynamicAnimator.addBehavior(collisionBehavior)
        
        collisionBehavior = UICollisionBehavior(items:[birdView8])
        collisionBehavior.translatesReferenceBoundsIntoBoundary = true
        dynamicAnimator.addBehavior(collisionBehavior)
        
        collisionBehavior = UICollisionBehavior(items:[birdView9])
        collisionBehavior.translatesReferenceBoundsIntoBoundary = true
        dynamicAnimator.addBehavior(collisionBehavior)
        
        collisionBehavior = UICollisionBehavior(items:[birdView10])
        collisionBehavior.translatesReferenceBoundsIntoBoundary = true
        dynamicAnimator.addBehavior(collisionBehavior)*/
        
        
        /*gravityBehavior = UIGravityBehavior(items:[birdView])
        dynamicAnimator.addBehavior(gravityBehavior)
        
        collisionBehavior = UICollisionBehavior(items: [birdView])
        collisionBehavior.translatesReferenceBoundsIntoBoundary = true
        dynamicAnimator.addBehavior(collisionBehavior)*/

        /*let RandomBirdArray = [1,2,3,4,5,6,7,8,9,10]
        for index in 0...9{
            let delay = Double(RandomBirdArray[index])
            let when = DispatchTime.now() + delay
            //let screenWidth = UIScreen.main.bounds.width
            
            DispatchQueue.main.asyncAfter(deadline: when){
                let birdNum = arc4random_uniform(3)
                let RandomBird = UIImageView(image: nil)
                
                
                RandomBird.image = UIImage.animatedImage(with: birdArray, duration: 0)
         
                }
                
                RandomBird.frame = CGRect(x:500, y:100, width: 30, height:50)
                self.view.addSubview(RandomBird)
                self.view.bringSubview(toFront: RandomBird)
                
            }
        }*/
        
        }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
}

