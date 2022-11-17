import React from 'react';
import { useEffect } from 'react';
import {useState} from 'react';


// const [AllActors,SetAllActors] =useState("");
// const [FName,SetFName] =useState("");
// const [LName, SetLName] =useState("");


// function GetAllActors(){
//     var Reference = "https://sakilascam-1668596780924.azurewebsites.net//Home/allActors/";
//     useEffect(() => {
//         fetch(Reference)
//         .then(res => res.json())  
//         .then(ActorList => {
//             SetAllActors(ActorList)
//         })
//     })
// }


// function GetActor(){
//     GetAllActors();
//     var Reference = "https://sakilascam-1668596780924.azurewebsites.net//Home/Actor/" +AllActors.length;
//     useEffect(() => {
//         fetch(Reference)
//         .then(Res => Res.json())
//         .then(Actor =>{
//             SetFName(Actor.firstName);
//             SetLName(Actor.lastName);
//         })
//     });
//     return(
//         <div>{FName}{LName}</div>
//     )
// }

// export default GetActor;