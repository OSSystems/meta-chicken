SECTION = "devel/chicken"
DESCRIPTION = "S-Expression diff algorithm"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://sexp-diff.meta;md5=a593670673cba292507e2066007124b6"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sexp-diff/sexp-diff-${PV}.tar.gz"

SRC_URI[md5sum] = "3c73cf3452f59473e31a465c24ead796"
SRC_URI[sha256sum] = "aa845fb17061b5315fb705e4006b71f77c82c36771b639aed3bb6046fc20e139"

S = "${WORKDIR}/sexp-diff-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
