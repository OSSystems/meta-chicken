SECTION = "devel/chicken"
DESCRIPTION = "The Common Lisp LOOP macro"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://loop.meta;md5=7a7680943bf2d39ff52fc8b5f8a4f963"
DEPENDS_append_class-cross = " chicken-egg-make-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-make-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-make chicken-egg-make-crosssdk"
DEPENDS = " chicken-egg-make chicken-egg-make-cross chicken-egg-loop-cross"
RDEPENDS_${PN} = " chicken-egg-make"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/loop/loop-${PV}.tar.gz"

SRC_URI[md5sum] = "1aac6f539e363a3b6509aaa9de681b1e"
SRC_URI[sha256sum] = "dd43dad9a9c9aba63441a28c7b351273add24e4a5b78b1e248acf9a6665724e3"

S = "${WORKDIR}/loop-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
