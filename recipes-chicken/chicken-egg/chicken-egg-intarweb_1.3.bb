SECTION = "devel/chicken"
DESCRIPTION = "A more convenient HTTP library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://intarweb.meta;md5=7f89d034a36ac9aacda9e4c972172d5f"
DEPENDS_append_class-cross = " chicken-egg-defstruct-cross chicken-egg-uri-common-cross chicken-egg-base64-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-defstruct-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-base64-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-defstruct nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-base64 chicken-egg-defstruct-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-base64-crosssdk"
DEPENDS = " chicken-egg-defstruct chicken-egg-uri-common chicken-egg-base64 chicken-egg-defstruct-cross chicken-egg-uri-common-cross chicken-egg-base64-cross"
RDEPENDS_${PN} = " chicken-egg-defstruct chicken-egg-uri-common chicken-egg-base64"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "7bb7c7aa4ca04e45a0fb5f3b7e118787"
SRC_URI[sha256sum] = "a9c24c77bd01646cdc0e2059d91622a7c3eee2b1510d11fadd5d20d35d234d02"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
