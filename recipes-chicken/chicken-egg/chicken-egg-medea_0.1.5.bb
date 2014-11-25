SECTION = "devel/chicken"
DESCRIPTION = "A JSON parser (and emitter) built with comparse"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://medea.meta;md5=db7d04912484e098bdd154c24d05bf6a"
DEPENDS_append_class-cross = " chicken-egg-comparse-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-comparse-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-comparse chicken-egg-comparse-crosssdk"
DEPENDS = " chicken-egg-comparse chicken-egg-comparse-cross"
RDEPENDS_${PN} = " chicken-egg-comparse"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "91090e7d31afe1844dd08331a4ea1e48"
SRC_URI[sha256sum] = "95453dc2eb7176974bcb466a57e868c62ec23fdd58a59691194b436358ae616b"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
