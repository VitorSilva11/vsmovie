import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css';

function Navbar(){

    return(
        <header>
            <nav className = "container">
                <div className='vsmovie-nav-content'>
                    <h1>VSMovie</h1>
                    <a href = "https://github.com/VitorSilva11">
                       <div className='vsmovie-contact-container'>
                          <GithubIcon/>
                          <p className='vsmovie-contact-link'>/VitorSilva11</p>
                      </div>
          
                    </a>
                </div>
            </nav>
        </header>

    );
}

export default Navbar;