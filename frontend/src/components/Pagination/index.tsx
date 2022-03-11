import {ReactComponent as Arrow} from 'assets/img/arrow.svg';
import { MoviePage } from 'types/movies';
import './styles.css';

type Props = {
    page : MoviePage;
    onChange: Function;
}

function Pagination({page, onChange} : Props){

    return(
        <div className="vsmovie-pagination-container">
            <div className="vsmovie-pagination-box">
                <button className="vsmovie-pagination-button" disabled={page.first} onClick ={() => onChange(page.number - 1)}>
                    <Arrow />
                </button>
                <p>{`${page.number + 1} de ${page.totalPages}`}</p>
                <button className="vsmovie-pagination-button" disabled={page.last} onClick = {() => onChange(page.number + 1)} >
                    <Arrow className="vsmovie-flip-horizontal" />
                </button>
            </div>
        </div>
    );

}

export default Pagination;