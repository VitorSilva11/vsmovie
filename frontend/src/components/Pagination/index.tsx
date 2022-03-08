import {ReactComponent as Arrow} from 'assets/img/arrow.svg';
import './styles.css';

function Pagination(){

    return(
        <div className="vsmovie-pagination-container">
            <div className="vsmovie-pagination-box">
                <button className="vsmovie-pagination-button" disabled={true} >
                    <Arrow />
                </button>
                <p>{`${1} de ${3}`}</p>
                <button className="vsmovie-pagination-button" disabled={false} >
                    <Arrow className="vsmovie-flip-horizontal" />
                </button>
            </div>
        </div>
    );

}

export default Pagination;