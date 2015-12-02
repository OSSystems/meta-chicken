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

SRC_URI[md5sum] = "817e5d63b0c64679ba034b05acf2a390"
SRC_URI[sha256sum] = "4f0659b865cb3a413972817ad2b7ec280b765ca84c6177c4e6b05e8f4392048f"

S = "${WORKDIR}/chicken-doc-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
