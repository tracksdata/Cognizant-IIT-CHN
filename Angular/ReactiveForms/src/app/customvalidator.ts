export class Customvalidator {
    
    // https://medium.com/@zeljkoradic/custom-form-validators-in-angular-6-using-regular-expressions-d421a5655adf

    // Validates US phone numbers
static phoneValidator(number): any {
    if (number.pristine) {
       return null;
    }
    const PHONE_REGEXP = /^(\([0-9]{3}\) |[0-9]{3}-)[0-9]{3}-[0-9]{4}$/;
    number.markAsTouched();
    if (PHONE_REGEXP.test(number.value)) {
       return null;
    }
    return {
       invalidNumber: true
    };
 }
 
}
