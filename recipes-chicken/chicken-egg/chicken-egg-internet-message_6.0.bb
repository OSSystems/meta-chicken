SECTION = "devel/chicken"
DESCRIPTION = "Parser combinators for Internet Message Format (RFC 5322)."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://internet-message.meta;md5=d711b303f993bedc095694860f2e8643"
DEPENDS_append_class-cross = " chicken-egg-typeclass-cross chicken-egg-utf8-cross chicken-egg-abnf-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-typeclass-crosssdk chicken-egg-utf8-crosssdk chicken-egg-abnf-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-typeclass nativesdk-chicken-egg-utf8 nativesdk-chicken-egg-abnf chicken-egg-typeclass-crosssdk chicken-egg-utf8-crosssdk chicken-egg-abnf-crosssdk"
DEPENDS = " chicken-egg-typeclass chicken-egg-utf8 chicken-egg-abnf chicken-egg-typeclass-cross chicken-egg-utf8-cross chicken-egg-abnf-cross"
RDEPENDS_${PN} = " chicken-egg-typeclass chicken-egg-utf8 chicken-egg-abnf"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/internet-message/internet-message-${PV}.tar.gz"

SRC_URI[md5sum] = "6831d6c7994187050b0610d642bd3014"
SRC_URI[sha256sum] = "cf10dd43e398dfbfc761d25c0e929d960dfe835f7f6dbb2538dbf6bcbd1c73a2"

S = "${WORKDIR}/internet-message-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
