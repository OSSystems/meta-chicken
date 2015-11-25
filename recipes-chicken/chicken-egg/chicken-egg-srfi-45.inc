do_install_prepend() {
    if grep -q '(include "setup-helper")' ${S}/${EGG}.setup; then
        sed -i -e 's/(include "setup-helper")/(use setup-helper-mod)/' ${S}/${EGG}.setup
    else
        echo 'The use of setup-helper in this eggs seems to have been fixed' >&2
        echo 'Please, remove this include file.' >&2
        exit 1
    fi
}
