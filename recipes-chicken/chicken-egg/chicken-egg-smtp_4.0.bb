SECTION = "devel/chicken"
DESCRIPTION = "Parser combinators and state machine for Simple Mail Transfer Protocol (RFC 5321)."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://smtp.meta;md5=39c79630bef887285488ea30ae2edb73"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-datatype-cross chicken-egg-typeclass-cross chicken-egg-utf8-cross chicken-egg-abnf-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-datatype-crosssdk chicken-egg-typeclass-crosssdk chicken-egg-utf8-crosssdk chicken-egg-abnf-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-datatype nativesdk-chicken-egg-typeclass nativesdk-chicken-egg-utf8 nativesdk-chicken-egg-abnf chicken-egg-matchable-crosssdk chicken-egg-datatype-crosssdk chicken-egg-typeclass-crosssdk chicken-egg-utf8-crosssdk chicken-egg-abnf-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-datatype chicken-egg-typeclass chicken-egg-utf8 chicken-egg-abnf chicken-egg-matchable-cross chicken-egg-datatype-cross chicken-egg-typeclass-cross chicken-egg-utf8-cross chicken-egg-abnf-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-datatype chicken-egg-typeclass chicken-egg-utf8 chicken-egg-abnf"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/smtp/smtp-${PV}.tar.gz"

SRC_URI[md5sum] = "d2e7d78f3ab6f8345d7b699bf61b19d5"
SRC_URI[sha256sum] = "073a18ad89bffdc7dd86bba3a81c4a4f403f14313e5d630ce06d06408345f0a0"

S = "${WORKDIR}/smtp-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
