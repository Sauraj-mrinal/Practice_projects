// accessing button 
const minusBtn = document.querySelector('.minus');
const plusBtn = document.querySelector('.plus');
const Incre_dec = document.querySelector('.inc_dec');
const resetBtn = document.querySelector('.reset-btn')

// console.log(Incre_dec.value);

 // when we click on + btn then it will 
    // it wii fetch curren value 
    
let currentValue = document.querySelector('.counter-value');
// console.log(currentValue);

// now i apply  event on plus and minus btn

plusBtn.addEventListener('click', ()=>{
    const inc_dec_val =parseInt( Incre_dec.value);
    let val = parseInt(currentValue.innerText);
    currentValue.innerText = val + inc_dec_val;
    
    
    
})
minusBtn.addEventListener('click', ()=>{
   let val = parseInt(currentValue.innerText);
   const inc_dec_val =parseInt( Incre_dec.value);
   currentValue.innerText = val - inc_dec_val;
    // console.log("-ve btn clickee");
    
    
})



    resetBtn.addEventListener('click', () => {
        currentValue.innerText = 0
    })
