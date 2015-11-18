SECTION = "devel/chicken"
DESCRIPTION = "Term rewriting for tree structures."
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://tree-rewrite.meta;md5=f52b54dbcf57e8c97964e169a64e1966"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/tree-rewrite/tree-rewrite-${PV}.tar.gz"

SRC_URI[md5sum] = "6d23f4409ca8558df1912712ef6413de"
SRC_URI[sha256sum] = "18efcf542adf5146d75020fa19ed41e618161c33bfa942ef848ae99861734046"

S = "${WORKDIR}/tree-rewrite-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
