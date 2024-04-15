package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName


data class PlaceResponse(val status :String, val places :List<Place>)

data class Place(val name: String, val location : Location,
   @SerializedName("formatted_address") val address :String)

data class Location(val lng: String , val lat: String)//经，纬度

//{
//     "status": "ok",
//     "query": "北京",
//     "places": [
//     {
//          "formatted_address": "北京市",
//          "id": "CN_110000",
//          "place_id": "CN_110000",
//          "name": "北京市",
//          "location": {
//          "lat": 39.904179,
//          "lng": 116.407387
//     }
//     },
//     {
//          "formatted_address": "北京市北京城区",
//          "id": "CN_110100",
//          "place_id": "CN_110100",
//          "name": "北京城区",
//          "location": {
//          "lat": 39.904989,
//          "lng": 116.405285
//     }
//     },
//     {
//          "formatted_address": "北京市",
//          "id": "CN_110000",
//          "place_id": "CN_110000",
//          "name": "北京市",
//          "location": {
//          "lat": 39.904179,
//          "lng": 116.407387
//     }
//     },
//     {
//          "formatted_address": "北京市北京城区",
//          "id": "CN_110100",
//          "place_id": "CN_110100",
//          "name": "北京城区",
//          "location": {
//          "lat": 39.904989,
//          "lng": 116.405285
//     }
//     },
//     {
//          "formatted_address": "北京市北京城区东城区",
//          "id": "CN_110101",
//          "place_id": "CN_110101",
//          "name": "东城区",
//          "location": {
//          "lat": 39.928359,
//          "lng": 116.416334
//     }
//     }
//     ]
//}