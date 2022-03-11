
import FormCards from 'components/FormCards';
import {useParams } from 'react-router-dom';


function Form(){

    const params = useParams();

    return(
       <FormCards movieId={`${params.movieId}`}/>
    );

}

export default Form