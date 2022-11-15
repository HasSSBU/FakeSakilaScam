import React, { useEffect } from 'react';
import {useState} from 'react';

function GetFilm(props){
    var reference = "http://localhost:8080/Home/Film/" + props.Id;
    const [error, setError] = useState(null);
    const [title, setTitle] = useState("");

    useEffect(() => {
        fetch(reference)
        .then(res => res.json())
        .then(Film =>{
            setTitle(Film.title);
        },
        error => {
            setError(error);
        }
        )
    },[])
    if(error){
        return(
            <div>Could not load API, null values Found</div>
        )
    }else{
        return(
            <div>
                <div id="Films">{title}</div>
            </div>
        )
    }
}

export default GetFilm;