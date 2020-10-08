package com.cmd.moducocktail

data class Cocktails(
    var image: Int,
    var name:String,
    var sweet:Float,
    var sour:Float,
    var bitter:Float,
    var sprite:Float,
    var alcohol:Float,
    var description:String,
    // TODO : ingredients에 해당하는 recyclerview 구현
    // var ingredients:ArrayList<String>,
    var recipes:String
)

