import React from 'react';
import { useLocation, useParams } from 'react-router-dom';
import GetFilmForPayment from '../FilmPayment.js';

function PaymentPage(){
    let Param = useParams();
    return(
        <div>
            
            <GetFilmForPayment Id={Param.Id} /> 
        </div>
    );
}

export default PaymentPage;