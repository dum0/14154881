//
//  DraggedImageView.swift
//  cw1project
//
//  Created by dm15abg on 22/11/2018.
//  Copyright © 2018 CSStestuser. All rights reserved.
//

import UIKit



class DraggedImageView: UIImageView {
    
    var startLocation: CGPoint?
    var myDelegate: subviewDelegate?
    
    override func touchesBegan(_ touches: Set<UITouch>, with event: UIEvent?) {
        startLocation = touches.first?.location(in: self)
    }
    
    override func touchesMoved(_ touches: Set<UITouch>, with event: UIEvent?) {
        
        let currentLocation = touches.first?.location(in: self)
        let dx = currentLocation!.x - startLocation!.x
        let dy = currentLocation!.y - startLocation!.y
        
        self.center = CGPoint(x:self.center.x+CGFloat(dx), y: self.center.y+CGFloat(dy))
        self.myDelegate?.changeSomething()
    }
    /*
    // Only override draw() if you perform custom drawing.
    // An empty implementation adversely affects performance during animation.
    override func draw(_ rect: CGRect) {
        // Drawing code
    }
    */

}
