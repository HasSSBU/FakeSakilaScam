import React, { useEffect } from 'react';
import {useState} from 'react';
import { BrowserRouter, Route, Link } from 'react-router-dom';

function GetFilm(props){
    var Reference = "http://localhost:8080/Home/Film/" + props.Id;
    const [Error, SetError] = useState(null);
    const [Id, SetId] = useState("");
    const [Title, SetTitle] = useState("");
    const [Desc, SetDesc] = useState("");
    const [RentRate, SetRentRate] = useState("");
    const [Rating, SetRating] = useState("");
    const [Actors, SetActors] = useState([]);
    const [Categories, SetCategories] = useState([]);


    function LoadActors(){
        const ActorContent = [];
        Actors.forEach(Element => {
            ActorContent.push(
            <><div>
                {Element.firstName} {Element.lastName}   
            </div></>)
        });
        return(
            ActorContent
        );
    }

    function LoadCategories(){
        const CategoryContent = [];
        Categories.forEach(Element => {
            CategoryContent.push(
            <><div>
                {Element.name}
            </div></>)
        });
        return(
            CategoryContent
        );
    }
    

    useEffect(() => {
        fetch(Reference)
        .then(Res => Res.json())
        .then(Film =>{
            SetTitle(Film.title);
            SetDesc(Film.description);
            SetRentRate(Film.rentalRate);
            SetRating(Film.rating);
            SetActors(Film.actorIds);
            SetCategories(Film.categories);
            SetId(Film.filmId);

        },
        Error => {
            SetError(Error);
        }
        )
    },[])
    if(Error){
        return(
            <div>Could not load API, null values Found</div>
        )
    }else{
        return(
            <div>
                <div id="title">{Title}</div>
                <div id="desc">{Desc}</div>
                <div id="rentRate">{RentRate}</div>
                <div id="rating">{Rating}</div>
                <div>{Actors !== [] ? LoadActors() : null}</div>
                <div>{Actors !== [] ? LoadCategories() : null}</div>
                <Link to={"/PaymentPage/" + Id}>
                    <button>Rent Me!</button>
                </Link>
            </div>
        )
    }
}

export default GetFilm;