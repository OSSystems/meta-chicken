SECTION = "devel/chicken"
DESCRIPTION = "Explore Chicken documentation locally"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://chicken-doc.meta;md5=e75bab4a31936faf6da5c0df10a597aa"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-regex-cross chicken-egg-fmt-cross chicken-egg-sxml-transforms-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-regex-crosssdk chicken-egg-fmt-crosssdk chicken-egg-sxml-transforms-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-regex nativesdk-chicken-egg-fmt nativesdk-chicken-egg-sxml-transforms chicken-egg-matchable-crosssdk chicken-egg-regex-crosssdk chicken-egg-fmt-crosssdk chicken-egg-sxml-transforms-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-regex chicken-egg-fmt chicken-egg-sxml-transforms chicken-egg-matchable-cross chicken-egg-regex-cross chicken-egg-fmt-cross chicken-egg-sxml-transforms-cross chicken-egg-chicken-doc-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-regex chicken-egg-fmt chicken-egg-sxml-transforms"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/chicken-doc/chicken-doc-${PV}.tar.gz"

SRC_URI[md5sum] = "f4903cafad67d091f74f4ca5dc80a7c3"
SRC_URI[sha256sum] = "e0dc0364831553f0672d46f714f8bce13a6f5066257bcb2b507c9827579e4861"

S = "${WORKDIR}/chicken-doc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
